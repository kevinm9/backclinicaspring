# backclinicaspring
backclinicaspring

```bash

para clonar este repo

git clone https://github.com/kevinm9/backclinicaspring.git

cd backclinicaspring

---configuracion del properties

cambiar los datos src/main/resources/application.properties
esta app usa el puerto 8080
para consumir con la otra app


https://github.com/kevinm9/frontzksprin
app usa el puerto 8081

tuve problemas al instalar oracle y lo hize en una maquina virtual donde lo use de manera remota cambiar la direcion ip o usar localhost

usar su usuario y contraseña.

---fin
al ejecutar la app se crean las tablas 


hace que se creen registro en la base de datos para poder visualizar y manipular en el front zk como prueba
 

ejecutar la aplicacion situarse en la repo y ejecutar:

mvn spring-boot:run


para llenar la info puede ingresar datos desde la bd o 
en el navegdor usar una sola  vez esta direccion

http://localhost:8080/sql

se mostrara este mensaje:

sql ejecutado

rutas 
APIREST

http://localhost:8080/doctor (get)
http://localhost:8080/especialidad (get)
http://localhost:8080/identificacion (get)
http://localhost:8080/paciente (get)
http://localhost:8080/reservacion/id (get)
http://localhost:8080/reservacion (post) (get)

controlador rest usado para validar la cedula del usuario en la bd oracle
http://localhost:8080/paciente/cedula?cedula=1251251250 (get)




```
