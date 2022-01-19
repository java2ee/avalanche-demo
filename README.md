# avalanche-demo
Демонстрационные проекты на основе "Avalanche - application framework for Java"

## Проект [demo](demo) 

Пример реализации простого приложения по модели MVFA (Model - View - Function - Application).

В этом приложении реализована функция с одним методом, который возращает информацию об операционной
системе, номере процесса (PID) с именем сервера и имя пользователя, под которым выполняется приложение.
Приведены локальный и удаленные примеры вызова этой функции по различным протокалам. Продемонстрирована
реализация каскадной функции и создание системы высокой доступности с использованием HADR интерфейса

Демонстрационное приложение запускается под управлением WEB сервера Jacarta-Tomcat.

* [WebContent](demo/WebContent) - статические и динамические (JSP) ресурсы проекта
* [conf](demo/cfg) - конфигурационные файлы
* [src/ru/funsys/demo/avalanche](demo/src/ru/funsys/demo/avalanche) - исходные файлы демонстрационного приложения

Описание приведено в HTML файлах, см. [index.html](demo/WebContent/index.html)

Назначение классов:
1. [ru.funsys.demo.avalanche.DemoFunction](demo/src/ru/funsys/demo/avalanche/DemoFunction.java) пример реализации класса функции
2. [ru.funsys.demo.avalanche.DemoAdapter](demo/src/ru/funsys/demo/avalanche/DemoAdapter.java) пример реализации класса адаптера функции
3. [ru.funsys.demo.avalanche.DemoApplication](demo/src/ru/funsys/demo/avalanche/DemoApplication.java) пример реализации класса приложения
3. [ru.funsys.demo.avalanche.DemoCascadeFunction](demo/src/ru/funsys/demo/avalanche/DemoCascadeFunction.java) пример реализации класса каскадной функции

Конфигурация приложения описана в конфигурационном файле Avalanche [avalanche-config.xml](demo/conf/avalanche-config.xml)

Для успешного выполнения проекта требуется наличие следующих библиотек в ./WebContent/WEB-INF/lib:
* avalanche-1.0.jar
* funsys-common-1.0.jar
* httpclient-4.5.3.jar
* httpcore-4.4.6.jar
* httpmime-4.5.3.jar
* log4j-api-2.7.jar
* log4j-core-2.7.jar
* log4j-web-2.7.jar



## Проект [rs](rs) (REST сервис)

Пример реализации универсального REST сервиса модификации содержимого таблиц БД.