// src/components/Recipe/LatestRecipeCard.jsx
import React from 'react';
import { Link } from 'react-router-dom';
import errorImage from '../../assets/images/error_image.jpg';

function LatestRecipeCard({ recipe }) {
    return (
        <div className="latest-recipe-card">
            <Link to={`/recipe/${recipe.recipeIdx}`}>
                <div className="recipe-card-image">
                    <img src={recipe.picture || '/images/default_recipe_image.jpg'} alt={recipe.title} onError={(e) => {
                        e.target.onerror = null;
                        e.target.src = errorImage;
                    }}/>
                </div>
                <div className="recipe-card-content">
                    <h5>{recipe.title}</h5>
                    <p className="description">{recipe.content}</p>
                </div>
            </Link>
        </div>
    );
}

export default LatestRecipeCard;
