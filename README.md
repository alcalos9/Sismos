# Sismos

_Evaluación Java, la cual consiste en crear endPoint que entreguen la información de sismos obtenidas desde la libreria "https://earthquake.usgs.gov/fdsnws/event/1"_

## Comenzando 🚀

_Las herramientas utilizadas para crear la aplicación y utilizarla, se encuentran mencionadas en el punto "Construido con".
Lo único necesario para comenzar el proyecto es descargarlo o clonarlo desde este repositorio._

Una vez descargado se debe abrir el IDE Spring Tool Suite 4, identificar el workspace requerido e importar el proyecto. También, desde el IDE se puede asociar en la opción "Team" (desde un nuevo proyecto) al repositorio git y descargar ahí el proyecto.

### EndPoints
#### Ruta: 
_http://localhost:8080/consultaDosFechas_
#### HEADER:
Content-Type:application/json

Authorization:Sismos eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJzb2Z0dGVrSldUIiwic3ViIjoiYWxlIiwiYXV0aG9yaXRpZXMiOlsiUk9MRV9VU0VSIl0sImlhdCI6MTU3MzcyNzI0NywiZXhwIjoxNTczNzI4MDQ3fQ.dZw64gdWKW0oabJrV6OhtBpdX-P3q3-DndD2JnRUGwqDnW3TSiAtfC8rovzmdM8sxc-u-y-F0Bvu4m1hXoyH3w
#### BODY:
_{
	"fechaInicioR1":"2019-10-13",
	"fechaTerminoR1":"2019-10-14"
}_


### Pre-requisitos 📋

_Contar con un computador, conexión a internet y conocimiento de las herramientas y tecnologías utilizadas._

## Construido con 🛠️

_Tecnologías y herramientas utilizadas:_

* Java 8
* Spring Boot
* Srping Security
* Spring Tool Suite 4
* Gradle
* JWT
* Postman (donde fueron probados y consultados los endpoint)



## Autore ✒️

* **Alejandro Calderón** - *Postulante

