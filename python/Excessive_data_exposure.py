def get_user_data(user_id):
    # retrieve user data from database
    user = User.objects.get(id=user_id)
    return user.to_dict()

@app.route('/users/<int:user_id>', methods=['GET'])
def expose_user_data(user_id):
    user_data = get_user_data(user_id)
    return user_data
  
