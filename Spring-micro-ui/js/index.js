function showPassword() {
    
        var key_attr = $('#key').attr('type');
    
        if (key_attr != 'text') {
    
            $('.checkbox').addClass('show');
            $('#key').attr('type', 'text');
    
        } else {
    
            $('.checkbox').removeClass('show');
            $('#key').attr('type', 'password');
    
        }
    
    }
    
    $(document).ready(function () {
        $("#btn-login").click(function () {
            let correo = document.getElementById("email").value;        
            $.ajax({
                type: "GET",
                url: "https://mito-micro-dz.herokuapp.com/persona/leerCorreo/" + correo,
                contentType: "application/json; charset=utf-8",
                dataType: "json",
                success: function (data) {                
                
                    if(data > 0){
                        sessionStorage.setItem("id", data);
                        window.location.href = "./principal.html";
                    }else{
                        toastr.warning("Credenciales incorrectas");
                    }
                },
    
                error: function (XMLHttpRequest, textStatus, errorThrown) {
                    toastr.error("Request: " + XMLHttpRequest.toString() + "\n\nStatus: " + textStatus + "\n\nError: " + errorThrown);
                }
            });
        });
    });