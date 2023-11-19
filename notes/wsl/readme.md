## Note for run service


In Ubuntu on WSL, many of the common system services still have the "old" init.d scripts available to be used in place of systemctl with Systemd units. You can see these by using ls /etc/init.d/.

So, for example, you can start ssh with sudo service ssh start, and it will run the /etc/init.d/ssh script with the start argument.

Even some non-default packages such as MySql/MariaDB will install both the Systemd unit files and the old init.d scripts, so you can still use the service command for them as well.

To autostart services (a la systemctl enable) at startup, see this answer on Super User for how to do this with /etc/wsl.conf.
