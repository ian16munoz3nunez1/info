# VirtualBox

```
sudo apt update
sudo apt full-upgrade -y
[ -f /var/run/reboot-required ] && sudo reboot -f
curl -fsSL https://www.virtualbox.org/download/oracle_vbox_2016.asc|sudo gpg --dearmor -o /etc/apt/trusted.gpg.d/oracle_vbox_2016.gpg
curl -fsSL https://www.virtualbox.org/download/oracle_vbox.asc|sudo gpg --dearmor -o /etc/apt/trusted.gpg.d/oracle_vbox.gpg
echo "deb [arch=amd64] https://download.virtualbox.org/virtualbox/debian bullseye contrib" | sudo tee /etc/apt/sources.list.d/virtualbox.list
sudo apt update
sudo apt install -y dkms
sudo apt install -y virtualbox virtualbox-ext-pack
sudo apt-get install virtualbox-guest-additions-iso
```

# wine

Instalar wine con 

```
sudo apt-get install wine wine64 winetricks
dpkg --add-architecture i386 && apt-get update && apt-get install wine32:i386
```

Configurar ***wine*** con los siguientes comandos

```
mkdir -p ~/myapp/prefix
export WINEPREFIX=$HOME/myapp/prefix
export WINEARCH=win32
export WINEPATH=$HOME/myapp
wineboot --init winetricks
```
Y agregar

```
export WINEPREFIX=$HOME/myapp/prefix
export WINEARCH=win32
export WINEPATH=$HOME/myapp
```
a `~/.bashrc` o `~/.zshrc`

# Formatear USB

```
sudo fdisk -l // Lista los discos disponibles
sudo mkdosfs -F 32 -I /dev/sdx
```

# XAMPP

- `sudo /opt/lampp/lampp startmysql` para iniciar el servidor MySQL.
- `/opt/lampp/bin/mysql -u root -p` para iniciar MySQL como root.

# .jar

```
javac -d . main.java
MANIFEST.MF --> Main-Class: main
jar -cvmf MANIFEST.MF main.jar main.class
java -jar main.jar
```

# Flatpak

```
sudo apt update
sudo apt install -y flatpak
sudo flatpak remote-add --if-not-exists flathub https://flathub.org/repo/flathub.flatpakrepo
sudo apt install gnome-software-plugin-flatpak
```

# Tor

```
sudo apt update
sudo apt install -y tor torbrowser-launcher
torbrowser-launcher
```

# yt-dlp

```
sudo curl -L https://github.com/yt-dlp/yt-dlp/releases/latest/download/yt-dlp -o /usr/local/bin/yt-dlp
sudo chmod a+rx /usr/local/bin/yt-dlp
```

o

```
sudo wget https://github.com/yt-dlp/yt-dlp/releases/latest/download/yt-dlp -O /usr/local/bin/yt-dlp
sudo chmod a+rx /usr/local/bin/yt-dlp
```

# vim

- `h` para moverse a la izquierda.
- `j` para moverse hacia abajo.
- `k` para moverse hacia arriba.
- `l` para moverse hacia la derecha.
- `Ctrl+h` para cambiar al panel izquierdo.
- `Ctrl+j` para cambiar al panel de abajo.
- `Ctrl+k` para cambiar al panel de arriba.
- `Ctrl+l` para cambiar al panel derecho.
- `Ctrl+e` para bajar linea por linea sin mover el cursor de posición.
- `Ctrl+d` para bajar media pantalla.
- `Ctrl+y` para subir linea por linea sin mover el cursor de posición.
- `Ctrl+u` para subir media pantalla.
- `Shift+$` para mover el cursor al final de la linea.
- `Shift+^` para mover el cursor al inicio de la linea.
- `v` para activar el modo ***Visual***.
- `Ctrl+v` para activar el modo ***Bloque Visual***.
- `i` para activar el modo ***Insertar***.
- `a` para avanzar un caracter e insertar.
- `Shift+a` para insertar al final de la linea.
- `o` para insertar debajo de la linea.
- `O` para insertar arriba de la linea.
- `u` para deshacer los cambios.
- `:w` para guardar los cambios.
- `:q` para cerrar el editor.
- `:q!` para cerrar el editor sin guardar los cambios.
- `:e` para actualizar el archivo.
- `:tabe` para abrir una nueva pestaña con un archivo o un buffer vacío.
- `gt` para moverse a la pestaña siguiente.
- `gT` para moverse a la pestaña anterior.
- `/` para buscar coincidencias en el archivo.
- `dd` para cortar la linea o el texto seleccionado.
- `#dd` para cortar # lineas desde el cursor hacia abajo.
- `yy` para copiar la linea o el texto seleccionado.
- `#yy` para copiar # lineas desde el cursor hacia abajo.
- `Shift+i`, en modo ***Bloque Visual*** inserta en todas las lineas seleccionadas.

# xiso

```
git clone https://github.com/XboxDev/extract-xiso.git
cd extract-xiso
mkdir build
cd build
cmake ..
make
```

# tmux

- `tmux ls` para listar las sesiones.
- `tmux a -t <session>` para entrar en la sesión \<session\>.
- `tmux nes -s <session>` para crear una nueva sesión con el nombre \<session\>.
- `tmux kill-session -t <session>` para matar una sesión de tmux.

Dentro de una sesión usando el prefijo `Ctrl+b`:

- `"` para dividir el panel en 2, arriba y abajo.
- `$` para renombrar la sesión actual.
- `%` para dividir el panel en 2, izquierda y derecha.
- `q` para listar brevemente el indice de los paneles.
- `x` para matar el panel actual.
- `c` para crear una nueva ventana.
- `,` para renombrar la ventana actual.
- `n` para cambiar a la ventana siguiente.
- `p` para cambiar a la ventana anterior.
- `w` para seleccionar una ventana interactivamente.
- `&` para matar la ventana actual.
- `(` para cambiar a la sesión previa.
- `)` para cambiar a la sesión siguiente.
- `0 to 9` seleccionar una ventana del 0 al 9.
- `?` para listar todos los atajos de teclas.
- `D` para elegir un cliente a desplegar.
- `d` para desplegar el cliente actual (salir de la sesión).
- `i` para mostrar información de la ventana actual.
- `s` para seleccionar una nueva sesión del cliente actual de forma interactiva.
- `t` para mostrar la hora.
- `[` para entrar en modo de copiado o moverse por la terminal.

# termux

- `termux-change-repo` para configurar los repositorios de la app.
- `termux-setup-storage` para montar el sistema de archivos de Android.
- `pkg update` y `pkg upgrade` para actualizar los paquetes.
- `pkg autoclean` para remover los paquetes innecesarios.
- `sshd` para iniciar el servicio ssh.
- `pkill sshd` para detener el servicio ssh.
- `passwd` para agregar o cambiar password.
- `ssh <IPv4> -p 8022` para conectarse por medio de ssh.

# git

- `git config --global user.name <username>` configura el nombre de usuario.
- `git config --global user.email <email>` configura el email de usuario.
- `git config --global core.editor <editor>` configura el editor por defecto.
- `git config --global --edit` para editar el archivo de configuración de git.
- `git init` para iniciar un respositorio local.
- `git status` muestra el estado del repositorio.
- `git status -s` muestra una versión corta del estado del repo.
- `git status -bs` muestra la rama y el seguimiento de esta.
- `git add <filename>` agrega al repo el archivo `<filename>` para agregarlo a un commit.
- `git commit` para hacer un nuevo commit.
- `git commit -m "<commit>"` se hace un nuevo commit sin abrir el editor por defecto.
- `git commit -a -m "<commit>"` para agregar todos los cambios y crea el nuevo commit.
- `git commit --amend` agrega los cambios al último commit creado, esto sin crear uno
nuevo, esto sirve para agregar cambios pequeños sin necesidad de agregarlos a un nuevo
commit.
- `git branch` muestra todas las ramas del repo.
- `git branch -a` muestra todas las ramas del repo, incluyendo las remotas.
- `git branch <branchname>` crea una nueva rama.
- `git branch -d <branchname>` elimina una rama.
- `git branch -D <branchname>` fuerza la eliminación de una rama.
- `git branch -v` muestra el nombre de rama, su hash y su commit.
- `git checkout <commithash/branchname>` para moverse a un commit o rama.
- `git checkout -b <branchname>` crea la rama `<branchname>` y se mueve a esta.
- `git log` muestra los commits realizados a detalle.
- `git log -p` muestra los commits realizados y los cambios en el código.
- `git log --oneline` muestra los commits en una sola línea.
- `git log --oneline --graph` muestra los commits de forma gráfica.
- `git log --follow <filename>` hace el seguimiento de un archivo a través de los cambios
del repo.
- `git log --follow -- <filename>` hace el seguimiento de un archivo aunque este fuera
del área de trabajo o eliminado.
- `git merge <branchname>` mezcla la rama `<branchname>` con la rama actual.
- `git revert <commithash>` corrige un error en algún commit y corrige los cambios en el
código.
- `git reset [--hard|--soft] <commithash>` regresa el repo al commit deseado.
- `git clone <url>` clona un repositorio remoto.
- `git remote remove origin` elimina la *url* a la que apunta *origin*.
- `git push origin <branchname>` sube al repositorio remoto la rama `<branchname>` o
actualiza los cambios en este.

Para crear un nuevo repositorio remoto:

1. `git branch -M main`
2. `git remote add origin <url>`
3. `git remote push -u origin main`

Sugerencias para crear commits:

`<commit_type>[scope]: <description>`

`<commit_type>`

- `feat`: Una nueva caracteristica para el usuario
- `fix`: Arreglo un bug que afecta al usuario
- `perf`: Cambios que mejoran el rendimiento del sitio
- `build`: Cambios en el sistema de build, tareas de despliegue o instalación
- `ci`: Cambios en la integración continua
- `docs`: Cambios en la documentación
- `refactor`: Refactorización del código como cambios de nombre de variables o funciones.
- `style`: Cambios de formato, tabulaciones, espacios o puntos y coma, etc; no afectan al usuario
- `test`: Añade tests o refactoriza uno existente

`<scope>`

En monorespositorios multipaquete, se puede añadir tambíen la información
del paquete que es afectado por el commit. Se le conoce como 'scope':

- `feat(backend)`: Descripción del commit.
- `fix(web)`: Descripción del commit.

# locales

- `locale` para ver la configuración del idioma del sistema.
- `dpkg-reconfigure locales` para configurar el idioma del sistema.

# esp32

- `python3 -m serial.tools.list_ports` para listar los puertos en uso.
- `esptool.py --chip esp32 --port /dev/ttyUSB* erase_flash` para limpiar la memoria de
la esp32.
- `esptool.py --chip esp32 --port /dev/ttyUSB* --baud 460800 write_flash -x 0x1000
<esp32version>.bin` para cargar el archivo binario a la esp32.
- `ampy --port /dev/ttyUSB* put <file>.py` para cargar un archivo a la esp32.
- `ampy --port /dev/ttyUSB* get <file>.py` para obtener un archivo a la esp32.
- `ampy --port /dev/ttyUSB* ls` para listar los archivos dentro de la esp32.
- `picocom /dev/ttyUSB* -b 115200` para crear una conexión serial con la esp32.
- `picocom /dev/ttyUSB* -b 115200 --lower-dtr --lower-rts` para crear una conexión
serial con la esp32cam.

# ssh

- `systemctl enable ssh` para iniciar el servicio ssh desde el arranque.
- `ssh-keygen` para generar una clave ssh en `~/.ssh`.
- `ssh-copy-id <username>@<IP>` para copiar la clave ssh a un equipo.
- `ssh <username>@<IP> -p 8022` para conectarse con Termux.

# vnc

En `x11` con `x11vnc` (`sudo apt install x11vnc`).

Para conocer el gestor de pantalla se usa `echo $XDG_SESSION_TYPE`.

Para agregar una contraseña al servidor vnc se usa `x11vnc -storepasswd`.

Para levantar el servidor con contraseña se usa `x11vnc -usepw`.

Usando el gestor de pantalla `wayland` se usa `wayvnc` (`sudo apt install wayvnc`).

Para levantar el servidor se ejecuta `wayvnc 0.0.0.0 5900 -r`

# samba

Para iniciar un servidor `smb` y conectarse a uno se instalan los siguientes paquetes:

```
sudo apt update
sudo apt install samba samba-common-bin smbclient cifs-utils
```

Un ejemplo para crear un directorio es el siguiente

```
cd ~
mkdir shared
chmod 740 shared
```

Se crea un usuario nuevo y se crea una contraseña para el servidor `Samba` para este nuevo
usuario con `sudo smbpasswd -a <username>`.

Se agrega lo siguiente

```
[share]
comment = Samba Server
path = /home/<username>/shared
read only = no
public = yes
writable = yes
browsable = yes
```

al archivo `/etc/samba/smb.conf`

Para revisar los puntos de montaje se usa el comando:

```
smbclient -L <hostname/IPaddress> -U <username>
```

Para conectarse al servidor se puede usar el siguiente comando:

```
sudo mount.cifs //<hostname or IP address>/<share> /home/<username>/shared -o user=<name>
```

# adb (Android Debug Bridge)

- Para listar los dispositivos conectados al equipo: `adb devices -l`
- Para conectarse a los dispositivos: `adb shell`

# system

- Para listar información de particiones:
    - `df -h`
    - `fdisk -l`
    - `lsblk`
- `apt-cache showpkg <package>` para mostrar información de un paquete.
- `cal` o `ncal` para ver un calendario o la fecha actual.
- `cat /etc/shells` para ver las terminales disponibles.
- `date` para ver la fecha y hora.
- `dpkg-query -W <package>` para mostrar la versión de un paquete instalado.
- `echo $SHELL`, `echo $0` o `echo $TERM` para ver el tipo de terminal.
- `eject <device>` para ejecutar un disco.
- `getent passwd <username>` y `getent group <username>` muestran información del usuario.
- `groups` muestra los grupos del sistema.
- `ls -l /dev/disk/by-uuid` o `ls -l /dev/disk/by-label` para listar los discos conectados.
- `lscpu` para tener información del equipo.
- `lsmem` para tener información de la memoria.
- `mount <device> <mountpoint>` para montar un disco conectado.
- `sudo dmidecode` para tener información del sistema.
- `sudo service --status-all` para listar los servicios que se están ejecutando.
- `sudo systemctl disable <service_name>` para deshabilitar un servicio.
- `sudo systemctl enable <service_name>` para habilitar un servicio.
- `sudo systemctl list-unit-files --type service --all` para mostrar todos los servicios.
- `sudo systemctl | grep running` para ver los servicios que se están corriendo.
- `umount <mountpoint>` para desmontar un disco.
- `uname -a` para tener información del sistema.
- `users` muestra el los usuarios del sistema.
- `whoami` muestra el usuario actual y `who` muestra información del usuario.

# linux-commands

- `cmatrix`.
- `cowsay`.
- `echo <password> | sudo -S <comando>` para ejecutar un comando con permisos de
- `echo <password> | sudo -u root -S <comando>` para ejecutar un comando con permisos de
administrador.
- `find . -maxdepth=1 -type f | wc -l` para contar el número de archivos en el
directorio actual.
- `find -name '*.<ext>' -type f` para listar archivos con cierta extensión.
- `find -name '*.<ext>' -type f -delete` para eliminar archivos con cierta extensión.
administrador
- `fortune`.
- `ls | wc -l` para contar el número de archivos en un directorio.
- `ls -d */` o `ls -F | grep /` para listar los directorios.
- `exiftool [-|h|v] <filename>` para ver los metadatos de un archivo.
- `exiftool -tag="<label>"` para agregar un tag o metadato al archivo.

# multimedia

- `convert -resize n% <filename>.<extension>` para generar una copia redimensionada de
una imagen.
- `ffmpeg -i image.jpg -vf scale=256:-1 image.ico` para generar un archivo .ico desde
cualquier tipo de imagen.
- `ffmpeg -i inputVideo.mkv -map 0:x -acodec copy -vcodec copy outputVideo.mp4` para
extraer el video de un archivo mkv.
- `ffmpeg -i inputVideo.* -vf scale=iw*0.0:ih*0.0 outputVideo.*` para ajustar las
dimensiones de un video.
- `ffmpeg -i audio.mp3 -i imagen.jpg -map 0 -map 1 audioImagen.mp3` para agregar una
imagen a un audio.
- `ffmpeg -i audio.mp3 -metadata artist='<artist>' outAudio.mp3` para agregar el
metadato 'artist' a un archivo de audio.
- `ffmpeg -i audio.mp3 -metadata title='<title>' outAudio.mp3` para agregar el metadato
'title' a un archivo de audio.
- `ffmpeg -i audio.mp3 -metadata album='<album>' outAudio.mp3` para agregar el metadato
'album' a un archivo de audio.
- `ffmpeg -i audio.mp3 -metadata genre='<genre>' outAudio.mp3` para agregar el metadato
'genre' a un archivo de audio.
- `img2txt` para mostrar una imagen con caracteres ASCII.
- `mogrify -resize n% <filename>.<extension>` para redimensionar una imagen.
- `yt-dlp -F <URL>` para ver los formatos disponibles de descarga de un video de YouTube.
- `yt-dlp -f 140/139 <URL> -o <fileName>` para descargar un video de YouTube con formato de
audio.
- `yt-dlp -f 22 <URL>` para descargar un video de YouTube con formato de video.

# network

- `curl ifconfig.me` o `ifconfig.me/all` para tener información pública del equipo.
- `hostname -f|i|a` para conocer el información de nuestro host.
- `ifconfig` o `ip a` para ver información de red del equipo.
- `iwconfig` para ver información de la red a la que estamos conectados.
- `iwgetid` para conocer el essid de la red a la que estamos conectados.
- `iwlist` para ver información de la red.
- `nmcli dev wifi` para ver una lista de redes wifi disponibles.
- `nmcli -f ALL dev wifi` para ver una lista más detallada de las redes disponibles.
- `nmcli -m multiline -f ALL dev wifi` muestra información de las redes disponibles en
un formato multilinea.
- `ping <IP>` para realizar una solicitud ICMP a un host.
- `route -n` muestra información de las tablas de enrutamiento de IP.
- `ss -4` para mostrar solo los sockets de versión IPv4.
- `sudo netstat -plnt` para mostrar los puertos abiertos.
- `sudo ufw enable` habilita el firewall `ufw` de linux.
- `sudo ufw disable` deshabilita el firewall `ufw` de linux.
- `sudo ufw allow` permite conexiones desde el puerto especificado.
- `sudo ufw deny` niega conexiones desde el puerto especificado.
- `sudo ufw delete` elimina una regla aplicada a un puerto.
- `sudo ufw status` muestra el estado del firewall y sus reglas.

# users

- `useradd` para crear un nuevo usuario.
- `usermod` para modificar un grupo.
- `userdel` para eliminar un usuario.
- `groupadd` para crear un nuevo grupo.
- `groupmod` para modificar un grupo.
- `groupdel` para eliminar un grupo.
- `chown <user>:<group> <files>` para cambiar el propietario de un archivo.
- `chgrp` para cambiar el grupo propiertario de un archivo.

# files and directories

- Configuración de variables de entorno y sistema `~/.zshrc`.
- Configuración de ***ssh*** `~/.ssh/`
- Configuración de ***vim*** `~/.vimrc`.
- Lanzar archivos en el arranque `~/.config/autostart/`.
- Configuración de interfaces de red `/etc/network/interfaces`.
- Configuración de ***apt*** `/etc/apt/`.
- Configuración de redes Wi-Fi `/etc/NetworkManager/system-connections/`.
- Configuración de ***lightdm*** `/etc/lightdm/`.
- Configuración de ***SAMBA*** `/etc/samba/smb.conf`.
- Lanzadores `/usr/share/applications/`.
- Diseño de sistema e iconos `/usr/share/icons`.

