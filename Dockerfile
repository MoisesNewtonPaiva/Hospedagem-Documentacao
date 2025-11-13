# Estágio 1: Construção (Build Stage)
# Usa uma imagem Java completa com Maven para compilar o código
FROM maven:3.9.5-eclipse-temurin-21 AS build

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia o arquivo pom.xml para que as dependências sejam baixadas primeiro (melhora o cache)
COPY pom.xml .

# Copia todo o código-fonte
COPY src ./src

# Executa o build do Maven. O -DskipTests pula os testes para agilizar,
# mas se os testes forem rápidos, você pode remover essa flag.
RUN mvn clean package -DskipTests

# Estágio 2: Execução (Runtime Stage)
# Usa uma imagem Java JRE (ambiente de execução) mais leve, que não tem o Maven
FROM eclipse-temurin:21-jre-alpine

# Define o diretório de trabalho
WORKDIR /app

# Copia o arquivo JAR compilado do estágio 'build' para esta imagem final
# O arquivo JAR é geralmente encontrado em target/ com o nome do artefato e versão.
# Substitua 'seu-projeto.jar' pelo nome real do seu arquivo JAR gerado no seu target/
COPY --from=build /app/target/*.jar app.jar 

# Expõe a porta que o Spring Boot usa (padrão 8080)
EXPOSE 8080

# Comando para iniciar a aplicação (Entrypoint)
ENTRYPOINT ["java", "-jar", "app.jar"]
