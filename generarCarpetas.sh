# Generar Carpetas de sesiones
contador=1
termina=11

until [ $termina -le $contador ]
do
	mkdir "Post-work Sesión $contador"
	echo $contador
	let contador=$contador+1
done
	
