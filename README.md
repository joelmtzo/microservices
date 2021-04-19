# Spring Boot - Microservices

This example project includes two microservices, department and employees.

## Hystrix

Hystrix is watching methods for failing calls to related services. If there is such a failure, it will open the circuit and forward the call to a fallback method.

## Service Registry

Enables client-side load-balancing and decouples service providers from consumers without the need for DNS.

## Cloud configuration

Configuration server provides server-side and client-side support for externalized configuration in a distributed system.

## API Gateway

Gateway aims to provide a simple, yet effective way to route to APIs and provide cross cutting concerns to them such as: security, monitoring/metrics, and resiliency.
