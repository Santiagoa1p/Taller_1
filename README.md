# GIT

## 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio en Git es un espacio donde Git almacena los archivos de un proyecto y, además, toda la información necesaria para controlar y registrar sus versiones. Un proyecto “normal” puede contener solamente los archivos actuales, mientras que un repositorio Git conserva también el historial de cambios, commits, ramas y otra información de control de versiones.

## 2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?

- **Working directory:** es la carpeta de trabajo donde se encuentran y modifican los archivos del proyecto.
- **Staging area (index):** es el área intermedia donde se seleccionan los cambios que se incluirán en el próximo commit mediante `git add`.
- **Repository:** es el área donde Git almacena de forma permanente los commits y el historial del proyecto.

## 3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).

Git representa la información mediante objetos. Un blob almacena el contenido de un archivo; un tree representa la estructura de directorios y relaciona nombres de archivos con blobs u otros trees; un commit registra un estado del proyecto y apunta a un tree, además de contener información del autor, mensaje y relación con commits anteriores; y un tag es una referencia con nombre que permite identificar un objeto, normalmente un commit, por ejemplo para marcar una versión.

## 4. ¿Cómo se crea un commit y qué información almacena un objeto commit?

Primero se seleccionan los cambios con `git add` y después se ejecuta `git commit -m "mensaje"`. El objeto commit almacena una referencia al estado del proyecto (tree), el commit padre o padres, información del autor y de quien realizó el commit, una marca de tiempo y el mensaje descriptivo del commit.

## 5. ¿Cuál es la diferencia entre git pull y git fetch?

`git fetch` descarga desde el repositorio remoto la información y los nuevos commits, pero no modifica directamente la rama de trabajo actual. `git pull` realiza un fetch y después integra esos cambios en la rama actual, normalmente mediante merge o, según la configuración, rebase.

## 6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

Un branch es una referencia con nombre que apunta a un commit. Al crear nuevos commits, el puntero de la rama avanza para señalar el commit más reciente. Esto permite trabajar en líneas de desarrollo independientes sin tener que duplicar todo el historial.

## 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

Un merge integra los cambios de una rama en otra. Git intenta combinar automáticamente los cambios. Puede aparecer un conflicto cuando dos ramas modifican de forma incompatible una misma parte de un archivo. Para resolverlo se revisan las marcas de conflicto, se decide qué contenido conservar, se corrige el archivo y después se ejecuta `git add` sobre el archivo resuelto y se completa el merge con un commit cuando sea necesario.

## 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

`git add` coloca en el staging area los cambios que se desean incluir en el próximo commit. Esto permite elegir qué modificaciones serán registradas. Si se omite `git add`, los cambios del working directory no quedan preparados para el commit, por lo que un `git commit` normal no los incluirá.

## 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

`.gitignore` es un archivo que contiene reglas para indicar a Git qué archivos o carpetas debe ignorar. Sirve, por ejemplo, para evitar que archivos temporales, archivos generados automáticamente o información local innecesaria sean incluidos en el control de versiones. Los archivos que coinciden con sus reglas normalmente no aparecen como cambios sin seguimiento.

## 10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?

`git commit --amend` modifica el commit más reciente en lugar de crear otro commit independiente. Puede utilizarse para corregir el mensaje o agregar/cambiar archivos del último commit. Un nuevo commit, en cambio, agrega una nueva entrada al historial y conserva el commit anterior tal como estaba.

## 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

`git stash` guarda temporalmente cambios no confirmados del working directory y del staging area para dejar el directorio de trabajo limpio. Es útil cuando se necesita cambiar de rama, actualizar el proyecto o realizar otra tarea sin tener que crear un commit con cambios que todavía no están listos. Posteriormente se pueden recuperar con comandos como `git stash pop` o `git stash apply`.

## 12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?

Git ofrece diferentes mecanismos según el tipo de cambio que se quiera deshacer. `git reset` puede mover una rama a otro commit y, según la opción utilizada, modificar el staging area o el working directory. `git revert` crea un nuevo commit que invierte los cambios de un commit anterior, por lo que conserva el historial. `git checkout` puede utilizarse para cambiar de rama y, en determinados usos, recuperar una versión de archivos. En versiones modernas de Git, `git restore` suele utilizarse específicamente para restaurar archivos.

## 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

Un remoto es un nombre que representa la dirección de otro repositorio. `origin` suele ser el nombre asignado automáticamente al repositorio remoto principal cuando se clona un repositorio. En un fork, `upstream` suele utilizarse para nombrar el repositorio original del que se creó el fork. Los remotos se pueden consultar con `git remote -v` y agregar con `git remote add upstream <URL>`. Para traer información del repositorio original se puede usar `git fetch upstream`; después se pueden integrar los cambios en la rama correspondiente.

## 14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?

`git log` muestra el historial de commits. `git diff` permite comparar cambios entre archivos, el working directory, el staging area u otras referencias. `git show` muestra información detallada de un commit u otro objeto, incluyendo los cambios asociados.

# Programación

## 15. ¿Cuáles son los tipos de datos primitivos en Java?

Java tiene ocho tipos de datos primitivos: `byte`, `short`, `int`, `long`, `float`, `double`, `char` y `boolean`. Los tipos numéricos permiten representar diferentes rangos de números; `char` representa un carácter y `boolean` representa un valor lógico verdadero o falso.

## 16. ¿Cómo funcionan las estructuras de control de flujo como if, else, switch y bucles en Java?

`if` permite ejecutar un bloque cuando una condición es verdadera. `else` permite indicar qué hacer cuando la condición del `if` no se cumple. `switch` permite seleccionar entre diferentes casos según el valor de una expresión. Los bucles permiten repetir instrucciones: `for` suele utilizarse cuando se conoce o controla una cantidad de repeticiones, `while` repite mientras una condición sea verdadera y `do-while` ejecuta el bloque al menos una vez antes de comprobar la condición.

## 17. ¿Por qué es importante usar nombres significativos para variables y métodos?

Los nombres significativos hacen que el código sea más fácil de leer, comprender, mantener y modificar. Un nombre como `precioProducto` comunica mejor la finalidad de una variable que un nombre genérico como `x`. Esto también facilita que otras personas comprendan el programa.

## 18. ¿Qué es la Programación Orientada a Objetos (POO)?

La Programación Orientada a Objetos es un paradigma de programación que organiza el software alrededor de objetos. Los objetos representan entidades con datos (atributos) y comportamientos (métodos), y se definen mediante clases. La POO busca organizar y reutilizar el código mediante conceptos como encapsulación, herencia, abstracción y polimorfismo.

## 19. ¿Cuáles son los cuatro pilares de la Programación Orientada a Objetos?

Los cuatro pilares son:

- **Encapsulación:** agrupa datos y comportamientos y controla el acceso a los datos.
- **Abstracción:** permite centrarse en las características esenciales de un objeto ocultando detalles innecesarios.
- **Herencia:** permite crear clases nuevas a partir de otras clases, reutilizando características.
- **Polimorfismo:** permite que una misma operación o referencia pueda comportarse de diferentes maneras según el objeto involucrado.

## 20. ¿Qué es la herencia en POO y cómo se utiliza en Java?

La herencia permite que una clase hija adquiera atributos y métodos de una clase padre. En Java se utiliza principalmente mediante la palabra clave `extends`. Por ejemplo, una clase `Perro` puede extender una clase `Animal` y reutilizar sus características, además de agregar comportamientos propios.

## 21. ¿Qué son los modificadores de acceso y cuáles son los más comunes en Java?

Los modificadores de acceso determinan desde qué lugares del programa se puede acceder a una clase, atributo o método. Los más comunes son `public`, `private`, `protected` y el acceso por defecto (sin modificador). `public` permite acceso desde cualquier lugar; `private` restringe el acceso a la propia clase; `protected` permite acceso dentro del mismo paquete y también desde clases hijas; y el acceso por defecto permite acceso dentro del mismo paquete.

## 22. ¿Qué es una variable de entorno y por qué son importantes para Java o la programación en general?

Una variable de entorno es un valor definido en el sistema operativo que puede ser utilizado por programas y procesos. En Java son importantes, por ejemplo, para indicar la ubicación de herramientas mediante variables como `JAVA_HOME` o para permitir que el sistema encuentre determinados ejecutables mediante `PATH`. En programación también sirven para configurar valores externos al código, como rutas o configuraciones del entorno.
