import React, { useEffect, useState } from 'react';
import axios from 'axios';

const HotelDetail = ({ match }) => {
    const [hotel, setHotel] = useState(null);

    useEffect(() => {
        const { id } = match.params;
        axios.get(`/api/hotels/${id}`)
            .then(response => {
                setHotel(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the hotel details!', error);
            });
    }, [match.params]);

    if (!hotel) return <div>Loading...</div>;

    return (
        <div>
            <h1>{hotel.name}</h1>
            <p>Location: {hotel.location}</p>
            <p>Price per Night: ${hotel.pricePerNight}</p>
        </div>
    );
};

export default HotelDetail;
