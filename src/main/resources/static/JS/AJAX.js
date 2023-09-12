            function ajax(){
                $.ajax({
                    type: "POST",
                    url: "/sorteia",
                    data:{
                        quantosNumeros:quantosNumeros,
                        numeroMinimo:numeroMinimo,
                        numeroMaximo:numeroMaximo,
                    },
                    success: function(data){
                        $("#errorMessage").text("");
                        if(data.status){
                            window.location.href="/";
                        }else{
                            showToast(data);
                        }

                    },
                    error: function(){
                        $("#errorMessage").append("Ops! Ocorreu um erro inesperado.");
                    }
                });
            }