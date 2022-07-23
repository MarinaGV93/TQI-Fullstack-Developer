import React from "react"
import ReactDOM from "react-dom"
import Button from "./Button"
import ComponenteA from "./ComponenteA"
import ComponenteB from "./ComponenteB"
import "./styles.css"

function soma(a, b){
    return a + b
    alert(a + b)
}

function App() { 
        return (
            <div className="App">
                {/* Chamar componente. Pode passar qualquer coisa */}
                {/* Pode ter mais de 1 componente dentro */}
                <Button onClick={() => soma(10,20)} name="Marina Golao Vale"/> 
                <ComponenteA>
                    <ComponenteB>
                    <Button onClick={() => soma(20,20)} name="Fiona Golao Vale"/>
                    </ComponenteB>
                </ComponenteA>
            </div>
        )
    }
    const rootElement = document.getElementById("root")
    ReactDOM.render(<App />, rootElement)