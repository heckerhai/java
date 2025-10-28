import React, { useState } from "react";

function App() {

 // Step 1: Create a state variable for background color

 const [bgColor, setBgColor] = useState("lightblue");

 // Step 2: Function to change background color

 const changeColor = () => {

 const colors = ["#FF5733", "#33FF57", "#3357FF", "#FFD700", "#FF33A8", "#00CED1"];

 const randomColor = colors[Math.floor(Math.random() * colors.length)];

 setBgColor(randomColor);

 };

 // Step 3: Return UI

 return (

 <div

 style={{

 backgroundColor: bgColor,

 height: "100vh",

 display: "flex",

 flexDirection: "column",

 justifyContent: "center",

 alignItems: "center",

 }}

 >

 <h2>Click the button to change background color</h2>

 <button

 onClick={changeColor}

 style={{

 padding: "10px 20px",

 fontSize: "18px",

 border: "none",

 borderRadius: "8px",

 backgroundColor: "#333",

color: "white",

 cursor: "pointer"

 }}

 >

 Change Color

 </button>

 </div>

 );

}

export default App;
