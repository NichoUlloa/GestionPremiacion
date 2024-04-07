### Sistema de Gestión de Premios Cinematográficos
#### Problemática:
Con el objetivo de reconocer y premiar el trabajo de directores y actores en la cinematografía chilena, se desea desarrollar un sistema de gestión de premios cinematográficos. Este sistema debe permitir gestionar diferentes aspectos de la premiación, asegurando la transparencia del proceso y proporcionando información relevante sobre las películas, directores y actores participantes.

#### lases Principales:
* Pelicula: Representa una película que participa en la premiación. Contiene información como director, actores, fecha de estreno, título, duración y sinopsis.
* Director: Representa a un director de cine, que puede estar vinculado a una o varias películas.
* Actor: Representa a un actor que participa en la premiación, vinculado a una o varias películas.
* Jurado: Representa a un miembro del jurado encargado de la votación en la premiación.
* GestionPremiacion: Gestiona la premiación, incluyendo la asignación de puntajes a las películas, la selección de películas ganadoras y la información sobre los premiados.
#### Requerimientos
##### Gestión de Participantes y Películas:
* Los directores y actores se consideran participantes en la premiación.
* Cada película tiene un director y uno o varios actores.
* La premiación se centra en las películas, pero se reconocen los méritos individuales de los directores y actores.
##### Transparencia del Proceso:
* Solo los directores y el jurado tienen acceso a la votación.
* Cada director recibe un aviso previo sobre si ha sido elegido ganador en una categoría específica. Este aviso es único por categoría, evitando la repetición de premios para un mismo participante en una misma categoría.
##### Información Disponible:
* El sistema debe proporcionar información sobre las películas ganadoras y su categoría correspondiente.
* Debe ser posible obtener la lista de actores que participan en una película determinada.
* Se requiere también la capacidad de identificar los actores participantes en una película ganadora.
* El sistema debe ser capaz de listar directores y actores que son parte de la premiación.

#### Diagrama de Clases UML
![Diagrama de Clases UML](![GestionPremiacion UML.png](GestionPremiacion%20UML.png)
