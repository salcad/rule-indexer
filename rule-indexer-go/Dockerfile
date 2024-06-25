FROM golang:1.22.4 as builder

WORKDIR /usr/src/app

COPY go.mod ./

RUN go mod download

COPY . .

RUN go build -o /usr/local/bin/app

FROM gcr.io/distroless/base-debian10

COPY --from=builder /usr/local/bin/app /usr/local/bin/app
COPY ./samples /samples

CMD ["/usr/local/bin/app"]
