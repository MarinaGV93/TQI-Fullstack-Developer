import React from "react"

// Desestruturação
const {name, onClick} = props
// cost name = props.name

function Button(props){
    return(
        <button onClick={onClick}>{name}</button>
    )
}

export default Button