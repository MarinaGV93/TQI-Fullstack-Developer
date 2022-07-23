import React from "react"
import ReactDOM from "react-dom"
import "./styles.css"

const elemento = 'Marina Golao Vale'
const elemento2 = <h1>Olá =D</h1>

function App() { 
    return (
        <div> 
            {elemento}
            {elemento2}
        </div>
    )
}

// Para renderizar a aplicaçãos
const rootElement = document.getElementById("root")
// Passa um parametro e executar o elemento
ReactDOM.render(elemento, rootElement)