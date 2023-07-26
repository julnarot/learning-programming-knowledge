# Apache solr basic commands
Now we are going to start apache solr service on wsl ubuntu, create a colecction and finally make a simple query curl get for recover information
### Start service, navigate to bin folder of apache solr
```bash
~ ./solr start -h 0.0.0.0 -Dsolr.jetty.host=0.0.0.0
```


### create collection
```bash
~ ./solr create -c new_collection
```
### Add csv file like a source data of new_collection

```bash
~ ./post -c new_collection /path/of/file.csv
```
### Go to Solr web dashboard

Navigate on you browser to `http://localhost:8983/`

In case that you can problem for access to url on your browser try recover base endpoint from lo conextion inet eth0 check with `ip address`

example:
```bash
~ ip address
1: lo: <LOOPBACK,UP,LOWER_UP> ....
...
2: eth0: <BROADCAST,MULTICAST,UP,LOWER_UP> ....
    link/ether 03:12..... brd aa:bb:cc....
    inet 172.20.30.251/20 <-------
    brd 172.20.31.255
       valid_lft ............
    inet6 fe3280s::as21s5:5asdfdff:fdfe8de:6sde1dc/64 scope link
...
```
and finally navigate to `http://172.20.30.251:8983/` looks like:

![solr dashboard](https://github.com/julnarot/general-public-assets/blob/main/screenshots/wsl_apache_solr_dashboard.PNG?raw=true)


## Making a request to new_collection for get data with curl
 Example: 

````bash
~ curl -X GET 'http://172.20.30.251:8983/solr/new_collection/select?q=txtToSearch'
{
  "responseHeader":{
    "status":0,
    "QTime":1,
    "params":{
      "q":"txtToSearch"}},
  "response":{"numFound":0,"start":0,"numFoundExact":true,"docs":[]
  }}
```

### Solr Cloud 
```
~ ./solr -e cloud
```

