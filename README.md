# avalanche-demo
Демонстрационные проекты на основе "Avalanche - application framework for Java"

## Проект ros (WEB сервис)
Реализация WEB сервиса, который принимает массивы данных и сохроняет их в таблицах БД. Структура принимаемых
WEB сервисом данных, описана в WSDL файлах.

В каталоге src/ru/transinfocom/erto/suik содержатся сгенерированные на освнове WSDL классы.

В каталоге src/ru/transset содержатся реализованные классы обработки полученных сервисом массивов данных.

Сгенерированный файл src/ru/transinfocom/erto/suik/service/ErtoServiceImplServiceSoapBindingImpl.java модифицирован.

JNDI имя "Avalanche - application framework for Java" определяется в файле конфигурации контекста ./conf/Catalina/localhost/ros.xml,
в котором определен и источник данных 

Инициализания "Avalanche - application framework for Java" описывается в ./WebContent/WEB-INF/web.xml

Сохроняемые в таблицах структуры данных описаны в конфигурационном файле Avalanche (./conf/avalanche-esma-config.xml).

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
