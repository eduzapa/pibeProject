# Requisitos pibeProject :joy:
## Requisitos funcionales
- **RF1**: El sistema debe leer y procesar un archivo en formato `csv` que contiene la información de las cuentas.
- **RF2**: El sistema debe leer y procesar un archivo en formato `json` que contiene la información de las sucursales
- **RF3**: El sistema debe comprobar que los datos introducidos con la información de las cuentas es válido.
- **RF4**: El sistema debe unir la información de los dos archivos mediante `id` del banco y guardar la información de cuentas válida en una bases de datos.
- **RF5**: El sistema debe guardar la información no válida en un archivo `csv` junto con la razón de la invalidez
- **RF6**: una vez procesados los archivos con la información de las cuentas y la información de las sucursales, el sistema debe comprobar que la sucursal del archivo con la información de la cuenta existe.
- **RF7**: si la sucursal existe y los datos de la cuenta bancaria son válidos, el sistema debe volcar la información de esa cuenta en un archivo `parquet`.

## Requisitos no funcionales
- **RNF1.1**: el sistema se implementará usando SCALA.
- **RNF1.2**: el sistema se implementará usando SPARK-SQL .
- **RNF2**: para el control de versiones se usará un repositorio `GitHub` (https://github.com/eduzapa/pibeProject).
- **RNF2.1**: el control de versiones constará mínimo de los entornos `pruebas`, `integracion` y `produccion`.
- **RNF3**: el sistema usará una base de datos de `MySQL`.
- **RNF3.1**: el despliegue de la base de datos se realizará usando `Docker` para los diferentes entornos definidos en `RNF2.1`.

## Requisitos de datos
- **RD1**: las cuentas bancarias tienen que tener un número de cuenta válido, usando IBAN (International Bank Account Number) es el identificador único para operaciones de pago en SEPA. El IBAN se compone de 24 caracteres:
    - 2 caracteres de identificación de país.
    - 2 caracteres de control.
    - 4 caracteres con el identificador de la entidad bancaria.
    - 4 caracteres con el código de la sucursal.
    - 2 caracteres de control.
    - 10 caracteres de identificación de la cuenta.

Los formatos válidos a considerar son por ejemplo:
        
        - `ES2100000000000000000000`

        - `ES21 0000 0000 00 0000000000`

        - `ES 21 00 00 00 00 00 00 00 00 00 00`

        - `ES21 0000 0000 0000 0000 0000`

        - `ES 21 0000 0000 00 0000000000`

- **RD2**: la sucursal tiene un código de identificación único, de 4 caracteres de longitud compuesto por dígitos. En caso de no aparecer los 4 dígitos, se considerará que a la izquierda del código hay ceros hasta alcanzar la longitud
Los formatos válidos a considerar son por ejemplo:
    - `0000`
    - `0015`
    - `15`
    - `015`
- **RD3**: el nombre del titular se compondrá de caracteres hasta una longitud de 255 caracteres.
- **RD4**: el nombre de la sucursal se compondrá de caracteres hasta una longitud de 255 caracteres.
