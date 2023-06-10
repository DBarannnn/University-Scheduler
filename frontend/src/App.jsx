import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'

function App() {
  const [count, setCount] = useState(0)

  return (
    <div className="App">
          <h1>Hello Vite + React!</h1>
          <img src={reactLogo} className="App-logo" alt="logo" />
          <img src={viteLogo} className="App-logo" alt="logo" />
          <p>You clicked {count} times</p>
          <button onClick={() => setCount(count + 1)}></button>
    </div>
  )
}

export default App
