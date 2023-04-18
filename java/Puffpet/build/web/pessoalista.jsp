<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="pt_BR" scope="application"/>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html lang="pt-br">
    <head>
        <meta charset="UTF-8"/>
        <title> Puffpet - Listar cadastros  </title>

        <link rel="shortcut icon" href="images/logos/logoicon.ico" type="image/x-icon" />
        <link rel="stylesheet" type="text/css" href="css/estilos-listar.css" />	
    </head>
    <body>
        <header id="header-index">
            <div id="div-header">
                <div id="div-header-layout">
                    <a href="index.html"><img id="imglogo" src="images/logos/logo420x110.png" title="Puffpet - Pet Shop Online" /></a>
                    <input type="text" name="search" id="search" size="80" placeholder="Pesquisar na Puffpet"></input>

                    <a href="cadastro-geral.html"><button name="btncadastro" id="btncadastro" title="Cadatre-se na Puffpet">
                            <img id="bonecologin" src="images/logos/bonecologin.png" />
                            <label id="txt1" class="txt">Olá, Entre</p><label href="cadastro.html" id="txt2" class="txt">ou Cadastre-se</p>
                                    <div class="triangle"></div>
                                    </button></a>

                                    <a href="listar-geral.html"><img id="carrinho" src="images/logos/carrinho.png"/></a>
                                    </div>

                                    <div id="div-header-buttons">
                                        <a href="cachorro-geral.html" class="btnmenu"> Cachorros </a>
                                        <a href="gato-geral.html" class="btnmenu"> Gatos </a>
                                        <a href="peixe-geral.html" class="btnmenu"> Peixes </a>
                                        <a href="passaro-geral.html" class="btnmenu"> Pássaros </a>
                                        <a href="outrospets-geral.html" class="btnmenu"> Outros Pets </a>
                                        <a href="casa-e-jardim.html" class="btnmenu"> Casa e Jardim </a>
                                    </div>
                                    </div>
                                    </header>
                                    <section id="conteudo">
                                        <table style="width:100%; margin-top: 5px; padding: 25px;" >
                                            <tr>
                                                <td colspan="4"> LISTAR CADASTROS </td>
                                            </tr>
                                            <tr>
                                                <td colspan="4"> </td>
                                            </tr>
                                            <tr>
                                                <td> ID </td>
                                                <td> Nome </td>
                                                <td> Telefone </td>
                                                <td> Endereco </td>
                                                <td> Email </td>
                                                <td> CPF </td>
                                                <td> Genero </td>
                                            </tr>
                                            <c:forEach var="i" items="${objPessoas}" varStatus="cont">
                                                <tr>
                                                    <td> ${i.idPessoa} </td>
                                                    <td> ${i.Nome} </td>
                                                    <td> ${i.Telefone} </td>
                                                    <td> ${i.Endereco} </td>
                                                    <td> ${i.Email} </td>
                                                    <td> ${i.Cpf} </td>
                                                    <td> ${i.Genero} </td>
                                                </tr>
                                            </c:forEach>
                                        </table>
                                    </section>
                                    <footer id="footer_index">
                                        <text> Este site é fruto de um projeto de trabalho de conclusão de curso | Senai CETAF-AJU </text>
                                        <p> Copyright© 2021 - All rights reserved </p>
                                    </footer>   
                                    </body>
                                    </html>