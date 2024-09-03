import React, { useEffect, useState } from 'react';
import axios from 'axios';

const RecommendationList = ({ userId }) => {
    const [recommendations, setRecommendations] = useState([]);

    useEffect(() => {
        axios.get(`/api/recommendations/${userId}`)
            .then(response => {
                setRecommendations(response.data);
            })
            .catch(error => {
                console.error('There was an error fetching the recommendations!', error);
            });
    }, [userId]);

    return (
        <div>
            <h2>Recommended Hotels</h2>
            <ul>
                {recommendations.map(hotel => (
                    <li key={hotel.id}>{hotel.name} - {hotel.location}</li>
                ))}
            </ul>
        </div>
    );
};

export default RecommendationList;
