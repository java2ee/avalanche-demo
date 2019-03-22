# avalanche-demo
Демонстрационные проекты на основе "Avalanche - application framework for Java"

## Проект ros (WEB сервис)
Реализация WEB сервиса, который принимает массивы данных и сохроняет их в таблицах БД. Структура принимаемых
WEB сервисом данных, описана в WSDL файлах.

В каталоге [src/ru/transinfocom/erto/suik](ros/src/ru/transinfocom/erto/suik) содержатся с генерированные на освнове WSDL классы.

В каталоге [src/ru/transset](ros/src/ru/transset) содержатся реализованные классы обработки полученных сервисом массивов данных.

С генерированный файл [ru.transinfocom.erto.suik.service.ErtoServiceImplServiceSoapBindingImpl.java](ros/src/ru/transinfocom/erto/suik/service/ErtoServiceImplServiceSoapBindingImpl.java) модифицирован.

Назначение классов: 
1. [ru.transset.esma.Element](ros/src/ru/transset/esma/Element) - пустой класс, содержит только декларацию, предназначен для определения порядка полей при сохранении данных в таблицу БД, экземпляры класса создаются при чтении конфигурационного файла
2. [ru.transset.esma.EsmaApplication](ros/src/ru/transset/esma/EsmaApplication) - основной класс реализации функционала, экземпляры класса создаются при чтении конфигурационного файла
3. [ru.transset.esma.EsmaService](ros/src/ru/transset/esma/EsmaService) - вспомогательный класс получения ссылки в WEB сервисе на экземпляр класса EsmaApplication и передачи ему массивов данных на обработку
4. [ru.transset.esma.TypeData](ros/src/ru/transset/esma/TypeData) - класс описания выполняемого SQL и порядка устанавливаемых значений, экземпляры класса создаются при чтении конфигурационного файла

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
