

INSERT INTO tipovacuna (nombre_tipo_vacuna) VALUES ("Rabia"), ("Moquillo"), ("Parvovirus"), ("Hepatitis Canina"), ("Leptospirosis"), ("Coronavirus Canino"), ("Bordetella"), ("Parainfluenza Canina"), ("Giardia"), ("Calicivirus Felino"), ("Rinotraqueitis Felina"), ("Panleucopenia Felina"), ("Leucemia Felina"), ("Peritonitis Infecciosa Felina"), ("Inmunodeficiencia Felina");

INSERT INTO TIPODOCUMENTOS (nombre_tipo_documento) VALUES ("Cédula de Ciudadanía"), ("Tarjeta de Identidad"), ("Registro Civil"), ("Cédula de Extranjería"), ("Pasaporte"), ("Permiso Especial de Permanencia"), ("NIT"), ("Documento Nacional de Identidad"), ("Carné Diplomático"), ("Salvoconducto de Permanencia"), ("Otro");

"C:\Program Files (x86)\Microsoft Visual Studio\Installer\vswhere.exe" -property catalog_productDisplayVersion

devenv /version

reg query "HKLM\SOFTWARE\Microsoft\VisualStudio\SxS\VS7"




// encriptador de claves//
package adoptApp.adoptApp.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptTest { public static void main(String[] args) { BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); String rawPassword = "password1"; // 👈 Cambia esto por la contraseña original String encodedPassword = encoder.encode(rawPassword); System.out.println("Contraseña encriptada: " + encodedPassword); } }
