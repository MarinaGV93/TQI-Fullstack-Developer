import React, {Component} from "react"
import ReactDOM from "react-dom"
import "./styles.css"


class App extends Component{

    constructor(props){ //Passar as propriedades
        super(props)

        // Pode usar em qualquer lugar da Classe
        this.state = {
            clock: 1000,
            copo: 'água'
        }
    }

    // Altera o valor o botao. Executa depois de renderizar
    componentDidMount(){
        window.setTimeout(() => {
            this.setState({
                copo: 'suco'
            })
        }, 3000)
    }

    alterarCopo = () => {
        // Controla o States
        this.setState({
            copo: 'refrigerante'
        })
        // Altera o valor. Nao ira renderizar automaticamente
        // this.state.copo = 'Refrigerante'
    }

    // Colocar quando tiver Classe
    render(){
        const {clock, copo} = this.state
        return(
            <div>
                <h1>{clock}</h1>
                <button onClick={ () => this.alterarCopo()}><h1>{copo}</h1></button>
            </div>
        )
    }
}

// Para renderizar a aplicaçãos
const rootElement = document.getElementById("root")
// Passa um parametro e executar o elemento
ReactDOM.render(elemento, rootElement)