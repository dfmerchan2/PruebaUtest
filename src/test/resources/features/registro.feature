# language: es

Característica: Realizar registro
  Yo como usuario
  Quiero registrarme en la pagina uTest
  Para acceder a los diferentes servicios

  Escenario: Registro exitoso
    Dado que Diego esta en la pagian uTest
    Y ingresa al formulario de registro
    Cuando ingresa la informacion personal
      | Nombre | Apellido | Correo                 | Fecha            | Ciudad   | CodigoPostal | Pais     | Clave       |
      | Diego  | Merchan  | dfMerchan101@gmail.com | November-17-1997 | Medellín | 10101        | Colombia | Diego*12344 |
    Y la informacion de los dispositivos
      | Computadora | Version | Idioma  | Celular | Modelo          | Sistema           |
      | Linux       | Fedora  | Spanish | Huawei  | Y9 Prime (2019) | Android 9.0 (Pie) |
    Entonces observa el mensaje de bienvenida <Welcome to the world's largest community of freelance software testers!>

