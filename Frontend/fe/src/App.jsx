
import './App.css';
import Navi from './layouts/Navi';
import 'semantic-ui-css/semantic.min.css'
import JobSeekerList from './pages/JobSeekerList';
import { Container } from 'semantic-ui-react';

function App() {
  return (
    <div className="App">
      <Navi className="navbar"/>
      <Container className='main'>
      </Container>

    </div>
  );
}

export default App;
