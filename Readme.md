# Spring Boot Actuator: Health Check, Auditing, Metrics Gathering and Monitoring 

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/cnarra14/spring-boot-actuator.git
```
mvn clean install

The app will start running at <http://localhost:8080>.

## Explore Actuator Endpoints

All the actuator endpoints will be available at <http://localhost:8080/actuator>.

Some of the actuator endpoints are protected with Spring Security's HTTP Basic Authentication. You can use the username `learn` and password `learn` for http basic authentication.


**Prometheus Installation  :** <https://prometheus.io/docs/prometheus/latest/installation> (Default URI:Port : <http://localhost:9090> )

 ``` bash
 prometheus --config.file=../spring-boot-actuator-demo/src/main/resources/prometheus.yml
  ```


**Grafana Installation :** <https://grafana.com/docs/grafana/latest/installation/mac>
   (Default URI:Port : <http://localhost:3000> )

