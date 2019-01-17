/*
 * Copyright (C) 2015 Brian Lee (@hiBrianLee)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hibrianlee.mvvmapp.viewmodel;

import android.support.annotation.NonNull;

import com.hibrianlee.mvvmapp.inject.ActivityComponent;

public abstract class ItemViewModel<ITEM_T> extends ViewModel {

    public ItemViewModel(@NonNull ActivityComponent activityComponent) {
        super(activityComponent, null);
    }

    public abstract void setItem(ITEM_T item);
}
