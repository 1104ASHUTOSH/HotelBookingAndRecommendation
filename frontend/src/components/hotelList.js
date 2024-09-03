import React, { useEffect, useState } from 'react';
import axios from 'axios';

const HotelList = () => {
    const [hotels, setHotels] = useState([]);

    useEffect(() => {
        axios.get('/api/hotels')
            .then(response => {
                setHotels(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the hotels!', error);
            });
    }, []);

    return (
        <div>
            <h1>Hotel List</h1>
            <ul>
                {hotels.map(hotel => (
                    <li key={hotel.id}>{hotel.name} - {hotel.location}</li>
                ))}
            </ul>
        </div>
    );
};

export default HotelList;
