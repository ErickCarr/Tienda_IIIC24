package com.tienda.service;

import org.springframework.web.multipart.MultipartFile;

public interface FirebaseStorageService {

    public String cargaImagen(MultipartFile archivoLocalCliente, String carpeta, Long id);

    // El BucketName debe coincidir con el nombre exacto del bucket en Firebase Storage
    final String BucketName = "techshop-iiic24-fab21.firebasestorage.app";

    // Esta es la ruta básica de este proyecto Techshop
    final String rutaSuperiorStorage = "techshop";

    // Ubicación donde se encuentra el archivo de configuración Json
    final String rutaJsonFile = "firebase";

    // El nombre del archivo Json
    final String archivoJsonFile = "techshop-iiic24-fab21-firebase-adminsdk-lylv6-c6ac70ea58.json";
}
