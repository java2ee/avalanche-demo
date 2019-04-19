# avalanche-demo
Демонстрационные проекты на основе "Avalanche - application framework for Java"

## Проект demo 

Пример реализации простого приложения по модели MVFA (Model - View - Function - Application).

В этом приложении реализована функция с одним методом, который возращает информацию об операционной
системе, номере процесса (PID) с именем сервера и имя пользователя, под которым выполняется приложение.
Приведены локальный и удаленные примеры вызова этой функции по различным протокалам. Продемонстрирована
реализация каскадной функции и создание системы высокой доступности с использованием HADR интерфейса

Назначение классов:
1. [ru.funsys.demo.avalanche.DemoFunction](demo/src/ru/funsys/demo/avalanche/DemoFunction.java) пример реализации класса функции
2. [ru.funsys.demo.avalanche.DemoAdapter](demo/src/ru/funsys/demo/avalanche/DemoAdapter.java) пример реализации класса адаптера функции
3. [ru.funsys.demo.avalanche.DemoApplication](demo/src/ru/funsys/demo/avalanche/DemoApplication.java) пример реализации класса приложения
3. [ru.funsys.demo.avalanche.DemoCascadeFunction](demo/src/ru/funsys/demo/avalanche/DemoCascadeFunction.java) пример реализации класса каскадной функции


## Проект ros (WEB сервис)

Реализация WEB сервиса, который принимает массивы данных и сохроняет их в таблицах БД. Структура принимаемых
WEB сервисом данных, описана в WSDL файлах.

В каталоге [src/ru/transinfocom/erto/suik](ros/src/ru/transinfocom/erto/suik) содержатся с генерированные на освнове WSDL классы.

В каталоге [src/ru/transset](ros/src/ru/transset) содержатся реализованные классы обработки полученных сервисом массивов данных.

С генерированный файл [ru.transinfocom.erto.suik.service.ErtoServiceImplServiceSoapBindingImpl.java](ros/src/ru/transinfocom/erto/suik/service/ErtoServiceImplServiceSoapBindingImpl.java) модифицирован.

Назначение классов: 
1. [ru.transset.esma.Element](ros/src/ru/transset/esma/Element.java) - пустой класс, содержит только декларацию, предназначен для определения порядка полей при сохранении данных в таблицу БД, экземпляры класса создаются при чтении конфигурационного файла
2. [ru.transset.esma.EsmaApplication](ros/src/ru/transset/esma/EsmaApplication.java) - основной класс реализации функционала, экземпляры класса создаются при чтении конфигурационного файла
3. [ru.transset.esma.EsmaService](ros/src/ru/transset/esma/EsmaService.java) - вспомогательный класс получения ссылки в WEB сервисе на экземпляр класса EsmaApplication и передачи ему массивов данных на обработку
4. [ru.transset.esma.TypeData](ros/src/ru/transset/esma/TypeData.java) - класс описания выполняемого SQL и порядка устанавливаемых значений, экземпляры класса создаются при чтении конфигурационного файла

JNDI имя "Avalanche - application framework for Java" определяется в файле конфигурации контекста [./conf/Catalina/localhost/ros.xml](ros/conf/Catalina/localhost/ros.xml),
в котором определен и источник данных 

Инициализания "Avalanche - application framework for Java" описывается в [./WebContent/WEB-INF/web.xml](ros/WebContent/WEB-INF/web.xml)

Сохроняемые в таблицах структуры данных описаны в конфигурационном файле Avalanche [./conf/avalanche-esma-config.xml](ros/conf/avalanche-esma-config.xml).

Для успешного выполнения проекта требуется наличие следующих библиотек в ./WebContent/WEB-INF/lib:
* avalanche-1.0.jar
* avalanche-sql-1.0.jar
* axis.jar
* commons-discovery-0.2.jar
* commons-logging-1.2.jar
* funsys-common-1.0.jar
* jaxrpc.jar
* log4j-api-2.7.jar
* log4j-core-2.7.jar
* log4j-web-2.7.jar
* saaj.jar
* wsdl4j.jar
