import logo from './logo.svg';
import './App.css';
import Header from './components/layout/Header';
import Nav from './components/layout/Nav';
import Footer from './components/layout/Footer';
import './styles/Header.css'
import './styles/Footer.css'
import './styles/Nav.css'
function App() {
  return (
    <div className="App">

     <Header></Header>
     <Nav></Nav>
     <Footer></Footer>
    </div>
  );
}

export default App;
