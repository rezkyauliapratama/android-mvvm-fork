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

package com.hibrianlee.sample.mvvm.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hibrianlee.mvvmapp.fragment.ViewModelFragment;
import com.hibrianlee.mvvmapp.inject.ActivityComponent;
import com.hibrianlee.mvvmapp.viewmodel.ViewModel;
import com.hibrianlee.sample.mvvm.R;
import com.hibrianlee.sample.mvvm.adapter.AndroidVersionsAdapter;
import com.hibrianlee.sample.mvvm.databinding.FragmentAndroidVersionsBinding;
import com.hibrianlee.sample.mvvm.viewmodel.AndroidVersionsViewModel;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class AndroidVersionsFragment extends BaseFragment {

    private AndroidVersionsViewModel androidVersionsViewModel;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_android_versions, container, false);
        ButterKnife.bind(this, root);
        return root;
    }

    @Nullable
    @Override
    protected ViewModel createAndBindViewModel(View root,
                                               @NonNull ActivityComponent activityComponent,
                                               @Nullable ViewModel.State savedViewModelState) {
        androidVersionsViewModel = viewModelFactory.createAndroidVersionsViewModel(
                new AndroidVersionsAdapter(viewModelFactory, activityComponent), activityComponent,
                savedViewModelState);
        FragmentAndroidVersionsBinding binding = FragmentAndroidVersionsBinding.bind(root);
        binding.setViewModel(androidVersionsViewModel);
        return androidVersionsViewModel;
    }

    @OnClick(R.id.hiBrianLee)
    void onClickHiBrianLee() {
        androidVersionsViewModel.onClickHiBrianLee();
    }
}
