   
   /* codigo de el proloader*/ 

     window.addEventListener('load', function() {
            var progressBar = document.getElementById('progress');
            var progressText = document.getElementById('progressText');
            var width = 0;
            // Duración total de la animación en milisegundos
            var duration = 3000; // Por ejemplo, 3000ms (3 segundos)
            // Intervalo que incrementa gradualmente el ancho de la barra de progreso
            var interval = setInterval(function() {
                // Si el preoceso llega a al final detiene la anim acion
                if (width >= 100) {
                    clearInterval(interval);
                    // lleva a la pagina que tu escribas
                    window.location.href = "inicio.html";
                } else {
                    // Incrementar el ancho de la barra de progreso
                    width++;
                    // Actualizar la barra de progreso y el texto de progreso
                    progressBar.style.width = width + '%';
                    progressText.textContent = width + '%';
                }
            }, duration / 100); // Intervalo de actualización en milisegundos
        });