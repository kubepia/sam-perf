FROM node:14.4-alpine

RUN mkdir /app

COPY . /app
WORKDIR /app
RUN npm i --production

ENTRYPOINT ["node"]
CMD ["bin/www"]