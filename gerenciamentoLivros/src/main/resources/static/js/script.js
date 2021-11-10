function form() {
    let modal = document.querySelector("#modal");
    modal.style.display = "block"

     document.querySelector(".fechar").addEventListener('click', () =>{

        modal.style.display="none";
    })
}


function cancelar() {
    let modal = document.querySelector("#modal");
    modal.style.display = "block"

     document.querySelector(".cancelar").addEventListener('click', () =>{

        modal.style.display="none";
    })
}

function sucesso() {
    let sucesso = document.querySelector('#modal-sucesso');
    sucesso.style.display = "block"

    document.querySelector(".ok").addEventListener('click', () =>{

        sucesso.style.display="none";
        modal.style.display = "none";

    })
}

