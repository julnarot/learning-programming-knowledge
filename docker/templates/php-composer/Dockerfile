FROM php:7.2-alpine3.8

RUN apk update
RUN apk add bash
RUN apk add curl

RUN apk update &amp;&amp; apk add build-base
RUN apk add docker-php-ext-configure \
  &amp;&amp; docker-php-ext-install pdo_mysql
RUN apk add zlib-dev git zip \
  &amp;&amp; docker-php-ext-install zip
RUN curl -sS https://getcomposer.org/installer | php \
        &amp;&amp; mv composer.phar /usr/local/bin/ \
        &amp;&amp; ln -s /usr/local/bin/composer.phar /usr/local/bin/composer
COPY . /src
WORKDIR /src
RUN composer install --prefer-source --no-interaction
# ENV PATH="~/.composer/vendor/bin:./vendor/bin:${PATH}"

# FROM nginx
# COPY ./nginx.conf /etc/nginx/nginx.conf
# # INSTALL COMPOSER
# RUN curl -s https://getcomposer.org/installer | php
# RUN alias composer='php composer.phar'
