import React from 'react';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import HotelList from './components/HotelList';
import HotelDetail from './components/HotelDetail';
import RecommendationList from './components/RecommendationList';

function App() {
    return (
        <Router>
            <div className="App">
                <Switch>
                    <Route path="/" exact component={HotelList} />
                    <Route path="/hotels/:id" component={HotelDetail} />
                    <Route path="/recommendations/:userId" component={RecommendationList} />
                </Switch>
            </div>
        </Router>
    );
}

export default App;