const path = require('path');
// Importar plugin
const HtmlWebPackPlugin = require("html-webpack-plugin");

module.exports = {
    // Ponto de entrada
    entry: './src/index.js', 
    output: {
    // O path pega o dirname = diretorio raiz e gera uma pasta chamada dist
    path: path.resolve(__dirname, 'dist'),
    // Nome do bundle'
    filename: 'bundle.js'
},

module: {
    rules: [
        {
            // O que vai interpretar
            test: /\.(js|jsx)$/,
            // Excluir
            exclude: /node_modules/,
            use:{
                loader: "babel-loader"
            }
        }
    ]
},

plugins: [
    new HtmlWebPackPlugin({
        template: "./src/index.html",
        filename: "./index.html"
    })
]
}