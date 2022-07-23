import React from "react"
import ReactDOM from "react-dom"
import "./styles.css"


function sum(a, b){
    return a + b
}

// JSX
function primeiroJSX(){
    return(
        <div className="teste">
            Marina Golao Vale - Introdução ao ReactJS
            <h1>Soma = {sum(10, 20)}</h1>
        </div>
    )
}

// Configuração
    // React Function / Componente 
    const App = () => { 
        return (
            // DIV = encapsulamento
            <div className="App"> 
                {/* Hello World */}
                {primeiroJSX()}
            </div>
        )
    }

    // Para renderizar a aplicação
    // Pega a DIV root
    const rootElement = document.getElementById("root")
    // Passa um parametro e executar o elemento
    ReactDOM.render(<App />, rootElement)