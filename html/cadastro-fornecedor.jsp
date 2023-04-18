

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title> Cadastrar-se como fornecedor </title>

        <link rel="shortcut icon" type="image/x-icon" href="images/logos/logoicon.ico" />
        <link rel="stylesheet" type="text/css" href="css/estilos-cadastro.css" />
        <script type="text/javascript" src="js/script.js"></script>
    </head>
    <body>
        <header id="header-cadastro">
            <div id="meio">
                <a href="index.html"><img id="logo" src="images/logos/logo420x110.png" /></a>
                <div id="ambiente-seguro">
                    <img id="cadeado" src="images/logos/cadeado.png" />
                    <nav>
                        <label> Ambiente </label>
                        <text> seguro </text>
                    </nav>
                </div>
            </div>
        </header>
        <section id="section-cadastro-cliente">

            <div id="div-cadastro">
                <div>

                    <nav id="nav-title">
                        <text> Cadastrar-se como fornecedor </text>
                    </nav>

                    <form name="form1" id="form1" action="fornecedor.do" method="post">
                        <input type="hidden" name="idfornecedor" value="${f.idFornecedor}" />
                        
                        <label class="label"> Razão Social: </label>
                        <input type="text" value="${f.RazaoSocial}" name="razaosocial" id="razaosocial" class="input" maxlength="45" size="60" placeholder="Digite a razão social" required />

                        <label class="label"> Email:  </label>
                        <input type="mail" value="${f.Email}" name="email" id="email" class="input" maxlength="60" size="60" placeholder="Digite seu email" required />

                        <label class="label"> Endereço: </label>
                        <input type="text" value="${f.Endereco}" name="endereco" id="endereco" class="input" maxlength="100" size="60" placeholder="Digite o endereço da fornecedora" required />

                        <label class="label"> CNPJ: </label>
                        <input type="number" value="${f.Cnpj}" name="cnpj" id="cnpj" class="input" maxlength="14" size="30" placeholder="CNPJ" required />

                        <label class="label"> Nome:  </label>
                        <input type="text" value="${f.Nome}" name="nome" id="nome" class="input" maxlength="45" size="30" placeholder="Digite seu nome" required /> 

                        <label class="label"> Função:  </label>
                        <input type="text" value="${f.Funcao}" name="funcao" id="funcao" class="input" maxlength="60" size="30" placeholder="Digite sua função na fornecedora" required />

                        <nav class="menu">
                            <a href="#" class="btnmenu" onclick="enviar('form1')"> Cadastrar </a>
                            <a href="#" class="btnmenu" onclick="limpar('form1')"> Limpar </a>
                        </nav>
                    </form>
                </div>
            </div>
        </section>
        <footer>
            <text> Este site é fruto de um projeto de trabalho de conclusão de curso | Senai CETAF-AJU </text>
            <p> Copyright© 2021 - All rights reserved </p>
        </footer>
    </body>
</html>
