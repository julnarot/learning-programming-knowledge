
# Error using gem


```bash
gem install asciidoctor-pdf
ERROR:  SSL verification error at depth 2: unable to get local issuer certificate (20)
ERROR:  You must add /......../=Zscaler Root CA/emailAddress=support@zscaler.com to your local trusted store
ERROR:  SSL verification error at depth 2: unable to get local issuer certificate (20)
ERROR:  You must add /......../=Zscaler Root CA/emailAddress=support@zscaler.com to your local trusted store
ERROR:  SSL verification error at depth 2: unable to get local issuer certificate (20)
ERROR:  You must add /......../=Zscaler Root CA/emailAddress=support@zscaler.com to your local trusted store
ERROR:  Could not find a valid gem 'asciidoctor-pdf' (>= 0), here is why:
          Unable to download data from https://rubygems.org/ - SSL_connect returned=1 errno=0 peeraddr=151.101.1.227:443 state=error: certificate verify failed (unable to get local issuer certificate) (https://rubygems.org/specs.4.8.gz)
ERROR:  SSL verification error at depth 2: unable to get local issuer certificate (20)
ERROR:  You must add /......../=Zscaler Root CA/emailAddress=support@zscaler.com to your local trusted store
ERROR:  SSL verification error at depth 2: unable to get local issuer certificate (20)
ERROR:  You must add /......../=Zscaler Root CA/emailAddress=support@zscaler.com to your local trusted store
```


## Steps for solve
### Download cerfiticate from zscaler

- Get Zscaler Certified visiting [https://www.zscaler.com/](https://www.zscaler.com/) got security

![](https://raw.githubusercontent.com/julnarot/general-public-assets/refs/heads/main/screenshots/zscaler-web.PNG)

- download certified
<h3></h3>

![](https://raw.githubusercontent.com/julnarot/general-public-assets/refs/heads/main/screenshots/zscaler-secured.PNG)

![](https://raw.githubusercontent.com/julnarot/general-public-assets/refs/heads/main/screenshots/zscaler-secured-show-certificate.PNG)

![](https://raw.githubusercontent.com/julnarot/general-public-assets/refs/heads/main/screenshots/zscaler-secured-show-certificate-select-rootcertificatehierarchy.PNG)


<h3></h3>

- save

<h3></h3>

![](https://raw.githubusercontent.com/julnarot/general-public-assets/refs/heads/main/screenshots/zscaler-secured-show-certificate-select-rootcertificatehierarchy-save.PNG)


- Copy the exported .crt file and place it in a directory accessible from WSL, such as your user home. in this case  `zscaler.crt` file was download on home folder of user
```bash
julnarot@artanis:~$ cd
julnarot@artanis:~$ 
julnarot@artanis:~$ ls
 develop   oradiag_julnarot   scripts   zscaler.crt
```

- Add the certificate to WSL trusted certificates

```bash
julnarot@artanis:~$ sudo cp zscaler.crt /usr/local/share/ca-certificates/zscaler.crt
[sudo] password for julnarot: 
julnarot@artanis:~$ sudo update-ca-certificates
Updating certificates in /etc/ssl/certs...
rehash: warning: skipping ca-certificates.crt,it does not contain exactly one certificate or CRL
1 added, 0 removed; done.
Running hooks in /etc/ca-certificates/update.d...
done.
```

- Now try install some dependency with `gem`

```bash 
julnarot@artanis:~$ gem install asciidoctor-pdf
Fetching ttfunk-1.7.0.gem
...
Fetching concurrent-ruby-1.3.4.gem
Fetching asciidoctor-2.0.23.gem
Successfully installed ttfunk-1.7.0
Successfully installed polyglot-0.3.5
...
Successfully installed asciidoctor-pdf-2.3.19
Parsing documentation for ttfunk-1.7.0
Installing ri documentation for ttfunk-1.7.0
...
Done installing documentation for ttfunk, polyglot, treetop, pdf-core, prawn, ruby-rc4, hashery, Ascii85, afm, pdf-reader, prawn-templates, prawn-table, public_suffix, addressable, css_parser, prawn-svg, prawn-icon, concurrent-ruby, asciidoctor, asciidoctor-pdf after 8 seconds
20 gems installed
```