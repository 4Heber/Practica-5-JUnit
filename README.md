
<img src="https://user-images.githubusercontent.com/77643882/168471152-bd528184-76ba-4cac-8ded-f3c828deb76d.png" alt="Junit logo" width="500" heigth="150"></img>
# Practica-5-JUnit

> - Crear Interfaz *ICalculadora* con las operaciones *sumar*, *restar*, *multiplicar* y *dividir*.
> - Crear Tests Unitarios mediante framework *JUnit*.
>   - Implementar métodos para realizar los tests.
> - Ejecutar pruebas para validar que los tests funcionan.

### Diagrama de ramas
<img src="https://user-images.githubusercontent.com/77643882/168471365-fb2f9c9d-a6d3-4f57-a518-43d4996c8844.png" alt="Junit logo" width="500" heigth="150"></img>

### Práctica realizada en Eclipse IDE

![Eclipse-ide-version](https://user-images.githubusercontent.com/77643882/168471632-e32c61fe-6d00-47db-9243-2b2aa854adf6.png)

### Crear Interfaz *ICalculadora* con las operaciones *sumar*, *restar*, *multiplicar* y *dividir*.

![01-interfaceCode](https://user-images.githubusercontent.com/77643882/168471509-04a2b561-9133-4ab5-9526-a504eefb3c2f.png)

### Crear Tests Unitarios mediante framework *JUnit*.

![05-howCreateJUnitTests](https://user-images.githubusercontent.com/77643882/168471553-30ccfd41-5a89-4af4-bf27-201345232a9c.png)

Una vez seleccionada la clase que deseamos testear, nos aparece la siguiente ventana emergente con una série de opciones a elegir, para este ejemplo nos limitamos a introducir el nombre de la clase y continuamos.

![10-junit-options](https://user-images.githubusercontent.com/77643882/168471563-41a44ca9-2e7d-41c7-9896-2aff8fbe3df0.png)

Una vez realizado los pasos previos, en la siguiente ventana indicamos para qué métodos queremos crear los tests.

![11-selectMethods](https://user-images.githubusercontent.com/77643882/168471566-77fc0b70-4511-4cd2-a9c7-04ec05036706.png)

Una vez finalizada la configuración previa, nos genera una clase con el sufijo Test y crea una série de funciones decorativas @Test que contienen los métodos tests en default:

![12-defaultClassMethods](https://user-images.githubusercontent.com/77643882/168471570-222511eb-5f0f-442d-918b-3d0c85ddff9a.png)

  #### Implementar métodos para realizar los tests.
  
  Instanciar objeto de clase Calculadora con los inputs necesarios, almacenar en variable expResult el valor esperado y en variable result el valor obtenido por el método, evaluar el resultado obtenido.
  
  ![13-Sumar-restar-tests](https://user-images.githubusercontent.com/77643882/168471582-70aad014-a89e-4949-b8cb-b493e6c00228.png)

  ![14-mult-div-tests](https://user-images.githubusercontent.com/77643882/168471584-ba373e43-6a85-4982-a0f1-abde4a6f4b39.png)

### Ejecutar pruebas para validar que los tests funcionan.

![20-executeTests](https://user-images.githubusercontent.com/77643882/168471603-7637ab61-dba8-45f5-a9a6-6f5e7b8cc8d2.png)

En el panel de JUnit podemos ver el resultado de los tests, para este prototipo los métodos retornan los valores esperados por tanto no se detectan fallos.

![21-results](https://user-images.githubusercontent.com/77643882/168471608-66fdac4e-197a-4ed7-97db-ebb0dbfd3bcd.png)

Si modificamos el valor esperado para la operación del método sumar este retorna un error en el panel de JUnit.

![22](https://user-images.githubusercontent.com/77643882/168471610-81cf67fc-63fb-4450-985b-38676cd0692a.png)



