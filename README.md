# spring-boot-keyvault
Sample Spring Boot project to demonstrate using Azure Keyvault certificate to configure HTTPS

Replace the following configuration values in application.yml with your own certificate in your Azure Keyvault
```
server:
  ssl:
    key-alias: my-certificate
azure:
  keyvault:
    uri: https://my-certificate.vault.azure.net/
```

Once the Spring Boot server is running, you can access the following path /index  in a browser to check the certificate 
