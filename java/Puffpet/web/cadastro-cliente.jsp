<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="pt_BR" scope="application"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title> Cadastrar-se como usuário </title>

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
                        <text> Cadastrar-se como cliente </text>
                    </nav>

                    <form name="form1" id="form1" action="pessoa.do" method="post">
                        <input type="hidden" name="idpessoa" value="${p.idPessoa}" />

                        <label class="label"> Nome: </label>  
                        <input type="text" value="${p.Nome}" name="nome" id="nome" class="input" maxlength="45" size="60" placeholder="Informe o seu nome" required />

                        <label class="label"> Telefone:  </label>
                        <input type="number" value="${p.Telefone}" name="telefone" id="telefone" class="input" maxlength="11" size="30" placeholder="Informe seu número para contato" required /> 

                        <label class="label"> Endereço: </label>
                        <input type="text" value="${p.Endereco}" name="endereco" id="endereco" class="input" maxlength="100" size="60" placeholder="Informe o seu endereço" required />

                        <label class="label"> Email:  </label>
                        <input type="mail" value="${p.Email}" name="email" id="email" class="input" maxlength="100" size="60" placeholder="Informe seu email" required />

                        <label class="label"> CPF: </label>
                        <input type="number" value="${p.Cpf}" name="cpf" id="cpf" class="input" maxlength="11" size="30" placeholder="Informe seu CPF" required />

                        <label class="label"> Gênero: </label>

                        <input type="radio" name="sexo" id="sexo" class="sexo" value="M" required checked /> Masculino
                        <input type="radio" name="sexo" id="sexo" class="sexoF" value="F" required /> Feminino


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
