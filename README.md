# demo-spring-boot-security-jwt

[![java-jdk](https://img.shields.io/badge/java%20jdk-1.8-brightgreen.svg)]()
[![spring-boot](https://img.shields.io/badge/spring%20boot-2.0.0.RC1-brightgreen.svg)]()
[![codecov](https://codecov.io/gh/romajs/demo-spring-boot-security-jwt/branch/master/graph/badge.svg)](https://codecov.io/gh/romajs/demo-spring-boot-security-jwt)
<!-- [![travis](https://api.travis-ci.org/romajs/demo-spring-boot-security-jwt.svg)](https://travis-ci.org/romajs/demo-spring-boot-security-jwt) -->
<!-- [![circleci](https://circleci.com/gh/romajs/demo-spring-boot-security-jwt.svg)](https://circleci.com/gh/romajs/demo-spring-boot-security-jwt)   -->

## Web API

URL: http://localhost:8080

### Authentication

#### Request

```sh
curl -i http://localhost:8080/login -H 'Content-Type: application/json' -d '{"username":"admin","password":"123"}' -X POST
```

#### Response

```http
HTTP/1.1 200
Authorization: Bearer <your generated jwt>
```

### Authenticated access

#### Request

```sh
curl -i http://localhost:8080/hello/world -H 'Authorization: Bearer <your generated jwt> '
```

#### Response

```http
HTTP/1.1 200
Hello World!
```

### Authenticated user details

#### Request

```sh
curl -i http://localhost:8080/user/details -H 'Authorization: Bearer <your generated jwt> '
```

#### Response

```http
HTTP/1.1 200
admin
```