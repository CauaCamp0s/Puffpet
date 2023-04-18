function limpar(nmForm) {
    document.getElementById(nmForm).reset();
}

function enviar(nmForm) {
    alert("Seu formulário foi enviado.")
    document.getElementById(nmForm).submit();
}