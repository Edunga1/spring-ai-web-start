# Introduction

Spring AI + ollama 사용하는 간단한 웹 서버.

Spring AI 소개 페이지는 https://docs.spring.io/spring-ai/reference/index.html

## Getting Started

Ollama 시작하기. docker-compose를 작성해 두었으므로 아래 명령어로 실행할 수 있습니다.

```bash
$ docker-compose up -d
```

Llama3 모델 다운로드 받기. Llama3는 약 5GB 정도의 용량을 차지하는 인기있는 모델입니다.

```bash
$ docker exec -it ollama ollama pull llama3
```

서버 시작 후 모델에 쿼리할 수 있습니다.

```bash
$ curl http://localhost:8080/chat\?q\=hello
{"response":"Hello! It's nice to meet you. Is there something I can help you with, or would you like to chat?"}
```

또는 브라우저에서 http://localhost:8080/chat?q=hello