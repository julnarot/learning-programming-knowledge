## oracle 11g express edition

## Check lister status 11

Inside oracle container change to *oracle*  with command `su oracle` and check status of listener with `lsnrctl status` like the next example


```bash
oracle-container# su oracle

oracle$ lsnrctl status


Connecting to (DESCRIPTION=(ADDRESS=(PROTOCOL=IPC)(KEY=EXTPROC_FOR_XE)))
STATUS of the LISTENER
------------------------
Alias                     LISTENER
Version                   TNSLSNR for Linux: Version x - Production
Start Date                23-APR-2024 20:30:29
Uptime                    0 days 0 hr. 11 min. 33 sec
Trace Level               x
Security                  x: Local OS Authentication
SNMP                      x
Default Service           XE
Listener Parameter File   /.../product/11.2.0/xe/network/admin/listener.ora
Listener Log File         /.../diag/tnslsnr/3c9b363c02a3/listener/alert/log.xml
Listening Endpoints Summary...
  (DESCRIPTION=(ADDRESS=(PROTOCOL=ipc)(KEY=EXTPROC_FOR_XE)))
  (DESCRIPTION=(ADDRESS=(PROTOCOL=tcp)(HOST=[IPADDRES])(PORT=PORT)))
  (DESCRIPTION=(ADDRESS=(PROTOCOL=tcp)(HOST=[IPADDRES])(PORT=PORT))(Presentation=HTTP)(Session=RAW))
Services Summary...
Service "PLSExtProc" has 1 instance(s)
...
```


